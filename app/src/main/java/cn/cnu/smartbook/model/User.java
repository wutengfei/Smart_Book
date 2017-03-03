package cn.cnu.smartbook.model;

/**
 * Created by dell on 2016/9/18.
 */
public class User {
    private int id;
    private String username;
    private String password;
    private String sex;
    private String school;
    private String grade;
    private String classes;
    private String gold;

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User(int id, String username, String password, String sex, String school, String grade, String classes, String gold) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.school = school;
        this.grade = grade;
        this.classes = classes;
        this.gold = gold;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getGold() {
        return gold;
    }

    public void setGold(String gold) {
        this.gold = gold;
    }
}
