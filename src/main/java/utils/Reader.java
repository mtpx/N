/*package utils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class Reader {

    public Properties readingFileUsersProperties() {
        Properties pro = new Properties();
        FileInputStream in = null;
        try {
            in = new FileInputStream("src\\test\\resources\\properties\\users.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pro;
    }

    public Properties readingFileCommentsProperties() {
        Properties pro = new Properties();
        FileInputStream in = null;
        try {
            in = new FileInputStream("src\\test\\resources\\properties\\comments.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pro;
    }
}

*/