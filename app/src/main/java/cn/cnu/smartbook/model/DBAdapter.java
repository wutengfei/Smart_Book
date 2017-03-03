package cn.cnu.smartbook.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

public class DBAdapter {

    private static final String DB_NAME = "smartbook.db";
    private static final int DB_version = 1;
    //用户表user
    private static final String DB_TABLE_USER = "user";
    private static final String KEY_userId = "userId";
    private static final String KEY_USERNAME = "loginName";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_REALNAME = "realName";
    private static final String KEY_SEX = "sex";
    private static final String KEY_SCHOOL = "school";
    private static final String KEY_GRADE = "grade";
    private static final String KEY_CLASSNUM = "classNum";
    private static final String KEY_Birthday = "birthyear";
    private static final String KEY_EnglishScore = "Englishscore";
    private static final String KEY_learningstyle1 = "learningstyle1";
    private static final String KEY_learningstyle2 = "learningstyle2";
    private static final String KEY_learningstyle3 = "learningstyle3";
    private static final String KEY_learningstyle4 = "learningstyle4";
    private static final String KEY_score = "score";
    private static final String KEY_loginTimes = "loginTimes";
    private static final String KEY_topiccount1 = "topiccount1";
    private static final String KEY_topiccount2 = "topiccount2";
    private static final String KEY_wordcount = "wordcount";
    private static final String KEY_resourcecount1 = "resourcecount1";
    private static final String KEY_resourcecount2 = "resourcecount2";
    private static final String KEY_resourcecount3 = "resourcecount3";
    private static final String KEY_resourcecount4 = "resourcecount4";
    private static final String KEY_workcount = "workcount";
    private static final String KEY_workcount1 = "workcount1";
    private static final String KEY_workcount2 = "workcount2";
    private static final String KEY_workcount3 = "workcount3";
    private static final String KEY_workcount4 = "workcount4";

    //资源表resource
    private static final String DB_TABLE_RESOURCE = "resource";
    private static final String KEY_word = "word";
    private static final String KEY_resourceId = "resourceId";
    private static final String KEY_photoUrl = "photoUrl";
    private static final String KEY_pictureUrl = "pictureUrl";
    private static final String KEY_soundUrl = "soundUrl";
    private static final String KEY_videoUrl = "videoUrl";
    private static final String KEY_version = "version";
    private static final String KEY_songUrl = "songUrl";
    private static final String KEY_clickPhoto = "clickPhoto";
    private static final String KEY_clickSound = "clickSound";
    private static final String KEY_clickVideo1 = "clickVideo1";
    private static final String KEY_clickVideo2 = "clickVideo2";
    private static final String KEY_clickVideo3 = "clickVideo3";
    private static final String KEY_textSentenceUrl = "textSentenceUrl";
    private static final String KEY_phaseUrl = "phaseUrl";

    //用户行为表userBehaviour
    private static final String DB_TABLE_userBehaviour = "userBehaviour";
    private static final String KEY_userBehaviourId = "userBehaviourId";
    private static final String KEY_doWhen = "doWhen";
    private static final String KEY_doWhere = "doWhere";
    private static final String KEY_doWhat = "doWhat";

    //用户登录表userLogin
    private static final String DB_TABLE_userLogin = "userLogin";
    private static final String KEY_userLoginId = "userLoginId";
    private static final String KEY_loginTime = "loginTime";
    private static final String KEY_logoutTime = "logoutTime";
    private static final String KEY_loginState = "loginState";

    //单词表word
    private static final String DB_TABLE_word = "word";
    private static final String KEY_wordId = "wordId";
    //private static final String KEY_word = "word";//前面已有
    private static final String KEY_topic = "topic";
    private static final String KEY_property = "property";
    private static final String KEY_wordClass = "wordClass";
    private static final String KEY_meaning = "meaning";
    // private static final String KEY_version = "version";//前面已有
    private static final String KEY_ceshu = "ceshu";//册数
    private static final String KEY_difficultLevel = "difficultLevel";
    private static final String KEY_textSentence = "textSentence";
    private static final String KEY_expandSentence = "expandSentence";
    private static final String KEY_imageWord = "imageWord";
    private static final String KEY_expandWord = "expandWord";
    private static final String KEY_wordGroup = "wordGroup";
    private static final String KEY_phase = "phase";
    // private static final String KEY_learningCount = "learningCount";//前面已有
    private static final String KEY_baike = "baike";//百科
    private static final String KEY_synonym = "synonym";
    private static final String KEY_antongym = "antongym";
    private static final String KEY_useMethod = "useMethod";


    //单词地图表wordMap
    private static final String DB_TABLE_wordMap = "wordMap";
    private static final String KEY_wordMapId = "wordMapId";
    //private static final String KEY_word= "word";//前面已有
    //private static final String KEY_topic= "topic";//前面已有

    //单词测试表wordTest
    private static final String DB_TABLE_wordTest = "wordTest";
    private static final String KEY_wordTestId = "wordTestId";
    //private static final String KEY_word= "word";//前面已有
    //private static final String KEY_topic= "topic";//前面已有
    //private static final String KEY_textSentence= "textSentence";//前面已有
    private static final String KEY_wordTest = "wordTest";
    private static final String KEY_testAspect = "testAspect";
    private static final String KEY_testDifficulty = "testDifficulty";

    //wordTopic
    private static final String DB_TABLE_wordTopic = "wordTopic";
    private static final String KEY_wordTopicId = "wordTopicId";
    //private static final String KEY_word= "word";//前面已有
    //private static final String KEY_topic= "topic";//前面已有
    private static final String KEY_learningCount = "learningCount";


    private SQLiteDatabase db;
    private final Context context;

    private static class DBOpenHelper extends SQLiteOpenHelper {
        public DBOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        //用户表user
        private static final String DB_CREATE_USER = "create table " + DB_TABLE_USER + "(" + KEY_userId +
                " integer primary key autoincrement," + KEY_USERNAME + " varchar(20)," + KEY_PASSWORD + " varchar(20)," +
                KEY_REALNAME + " varchar(20)," + KEY_SEX + " varchar(10)," + KEY_SCHOOL + " varchar(100)," +
                KEY_GRADE + " varchar(10)," + KEY_CLASSNUM + " varchar(10)," + KEY_Birthday + " varchar(10)," +
                KEY_EnglishScore + " varchar(10)," + KEY_learningstyle1 + " varchar(10)," + KEY_learningstyle2 + " varchar(10)," +
                KEY_learningstyle3 + " varchar(10)," + KEY_learningstyle4 + " varchar(10)," + KEY_score + " varchar(10)," +
                KEY_loginTimes + " varchar(20)," + KEY_topiccount1 + " varchar(10)," + KEY_topiccount2 + " varchar(10)," +
                KEY_wordcount + " varchar(20)," + KEY_resourcecount1 + " varchar(10)," + KEY_resourcecount2 + " varchar(10)," +
                KEY_resourcecount3 + " varchar(20)," + KEY_resourcecount4 + " varchar(10)," + KEY_workcount + " varchar(10)," +
                KEY_workcount1 + " varchar(20)," + KEY_workcount2 + " varchar(10)," + KEY_workcount3 + " varchar(10)," +
                KEY_workcount4 + " varchar(20))";
        //资源表resource
        private static final String DB_CREATE_RESOURCE = "create table " + DB_TABLE_RESOURCE + "(" + KEY_resourceId +
                " integer primary key autoincrement," + KEY_word + " varchar(50)," + KEY_photoUrl + " varchar(100)," +
                KEY_pictureUrl + " varchar(100)," + KEY_soundUrl + " varchar(100)," + KEY_videoUrl + " varchar(100)," +
                KEY_version + " varchar(20)," + KEY_songUrl + " varchar(100)," + KEY_clickPhoto + " varchar(10)," +
                KEY_clickSound + " varchar(10)," + KEY_clickVideo1 + " varchar(10)," + KEY_clickVideo2 + " varchar(10)," +
                KEY_clickVideo3 + " varchar(10)," + KEY_textSentenceUrl + " varchar(100)," + KEY_phaseUrl + " varchar(100))";

        //用户行为表userBehaviour
        private static final String DB_CREATE_userBehaviour = "create table " + DB_TABLE_userBehaviour + "(" +
                KEY_userBehaviourId + " integer primary key autoincrement," + KEY_userId + " varchar(10)," +
                KEY_doWhen + " varchar(20)," + KEY_doWhere + " varchar(20)," + KEY_doWhat + " varchar(20))";

        //用户登录表userLogin
        private static final String DB_CREATE_userLogin = "create table " + DB_TABLE_userLogin + "(" +
                KEY_userLoginId + " varchar," + KEY_userId + " varchar," + KEY_loginTime + " varchar,"
                + KEY_logoutTime + " varchar," + KEY_loginState + " varchar)";

        //单词表word
        private static final String DB_CREATE_word = "create table " + DB_TABLE_word + "(" + KEY_wordId +
                " integer primary key autoincrement," + KEY_word + " varchar," + KEY_topic + " varchar," +
                KEY_property + " varchar," + KEY_wordClass + " varchar," + KEY_meaning + " varchar," +
                KEY_version + " varchar," + KEY_ceshu + " varchar," + KEY_difficultLevel + " varchar," +
                KEY_textSentence + " varchar," + KEY_expandSentence + " varchar," + KEY_imageWord + " varchar," +
                KEY_expandWord + " varchar," + KEY_wordGroup + " varchar," + KEY_phase + " varchar," +
                KEY_learningCount + " varchar," + KEY_baike + " varchar," + KEY_synonym + " varchar," +
                KEY_antongym + " varchar," + KEY_useMethod + " varchar)";

        //单词地图wordMap
        private static final String DB_CREATE_wordMap = "create table " + DB_TABLE_wordMap + "(" + KEY_wordMapId +
                " integer primary key autoincrement," + KEY_word + " varchar," + KEY_topic + " varchar)";

        //单词测试wordTest
        private static final String DB_CREATE_wordTest = "create table " + DB_TABLE_wordTest + "(" + KEY_wordTestId +
                " integer primary key autoincrement," + KEY_word + " varchar," + KEY_topic + " varchar" +
                KEY_textSentence + " varchar," + KEY_wordTest + " varchar" + KEY_testAspect + " varchar," +
                KEY_testDifficulty + " varchar)";

        //wordTopic表
        private static final String DB_CREATE_wordTopic = "create table " + DB_TABLE_wordTopic + "(" + KEY_wordTopicId +
                " integer primary key autoincrement," + KEY_word + " varchar," + KEY_topic + " varchar" +
                KEY_learningCount + " varchar)";

        @Override
        public void onCreate(SQLiteDatabase _db) {
            _db.execSQL(DB_CREATE_USER);
            _db.execSQL(DB_CREATE_RESOURCE);
            _db.execSQL(DB_CREATE_userBehaviour);
            _db.execSQL(DB_CREATE_userLogin);
            _db.execSQL(DB_CREATE_word);
            _db.execSQL(DB_CREATE_wordMap);
            _db.execSQL(DB_CREATE_wordTest);
            _db.execSQL(DB_CREATE_wordTopic);
        }

        @Override
        public void onUpgrade(SQLiteDatabase _db, int _oldVersion, int _newVersion) {
            _db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE_USER);
            _db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE_RESOURCE);
            _db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE_userBehaviour);
            _db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE_userLogin);
            _db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE_word);
            _db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE_wordMap);
            _db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE_wordTest);
            _db.execSQL("DROP TABLE IF EXISTS " + DB_TABLE_wordTopic);
            onCreate(_db);
        }

    }

    public DBAdapter(Context _context) {
        context = _context;
    }

    public void open() throws SQLiteException {
        DBOpenHelper dbOpenHelper = new DBOpenHelper(context, DB_NAME, null, DB_version);
        try {
            db = dbOpenHelper.getWritableDatabase();
        } catch (SQLiteException ex) {
            db = dbOpenHelper.getReadableDatabase();
        }
    }

    public void close() {
        if (db != null) {
            db.close();
            db = null;
        }
    }

    /////////////////////////////////////用户模块
    //增加用户
    public long insert(User user) {
        ContentValues newValues = new ContentValues();
        newValues.put(KEY_USERNAME, user.getUsername());
        newValues.put(KEY_PASSWORD, user.getPassword());
        return db.insert(DB_TABLE_USER, null, newValues);
    }

    //删除所有用户
    public long deleteAllData() {
        return db.delete(DB_TABLE_USER, null, null);
    }

    //删出一个用户
    public long deleteOneDataByName(String username) {
        return db.delete(DB_TABLE_USER, KEY_USERNAME + " like ? ", new String[]{username});
    }

    //更新用户信息
    public long updateOneDataByName(String username, User user) {
        ContentValues updateValues = new ContentValues();
        updateValues.put(KEY_USERNAME, user.getUsername());
        updateValues.put(KEY_PASSWORD, user.getPassword());
        return db.update(DB_TABLE_USER, updateValues, KEY_USERNAME + " like ? ", new String[]{username});

    }

    public User[] getOneByName(String username) {
        Cursor cursor = db.query(DB_TABLE_USER, new String[]{KEY_USERNAME, KEY_PASSWORD},
                KEY_USERNAME + " like ? ", new String[]{username}, null, null, null, null);
        return ConvertToUser(cursor);
    }

    public User[] getAllUser() {
        Cursor cursor = db.query(DB_TABLE_USER, new String[]{KEY_USERNAME, KEY_PASSWORD},
                null, null, null, null, KEY_USERNAME + " asc");//asc是排序规则，升序
        return ConvertToUser(cursor);
    }

    private User[] ConvertToUser(Cursor cursor) {
        int resultCounts = cursor.getCount();
        if (resultCounts == 0 || !cursor.moveToFirst()) return null;
        User[] peoples = new User[resultCounts];
        for (int i = 0; i < resultCounts; i++) {
            peoples[i] = new User();
            peoples[i].setUsername(cursor.getString(cursor.getColumnIndex(KEY_USERNAME)));
            peoples[i].setPassword(cursor.getString(cursor.getColumnIndex(KEY_PASSWORD)));
            cursor.moveToNext();
        }
        return peoples;
    }


}