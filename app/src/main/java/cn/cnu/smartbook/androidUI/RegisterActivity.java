package cn.cnu.smartbook.androidUI;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import cn.cnu.smartbook.R;
import cn.cnu.smartbook.control.UserController;
import cn.cnu.smartbook.model.User;

public class RegisterActivity extends AppCompatActivity {
    private EditText et_username;
    private EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().hide();
        et_username = (EditText) findViewById(R.id.et_username);
        et_password = (EditText) findViewById(R.id.et_password);
    }

    public void register(View v) {
        String name = et_username.getText().toString().trim();
        String pass = et_password.getText().toString().trim();
        User user = new User(name, pass);
        UserController userController = new UserController(RegisterActivity.this);
        if (name.equals("")||pass.equals("")) {
            new android.app.AlertDialog.Builder(RegisterActivity.this).setMessage("请填写完整").show();
        } else {
            if (userController.QueryOneByName(name) != null) {
                Toast.makeText(RegisterActivity.this, "用户名已存在", Toast.LENGTH_SHORT).show();
            } else if (userController.addUser(user)) {
                Toast.makeText(RegisterActivity.this, "注册成功，请登录", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
            }
        }
    }
}
