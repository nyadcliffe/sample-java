package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainClass {

    public static void main(String[] args) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // ドライバクラスをロード
            Class.forName("com.mysql.jdbc.Driver");

            // DB接続
            connection = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "mysqlroot");

            // SQL文字列
            String queryString = "select * from tab1";

            // ステートメントオブジェクトを生成
            preparedStatement = connection.prepareStatement(queryString);

            // クエリー実行
            ResultSet resultSet = preparedStatement.executeQuery();

            // 検索結果数分、ループ
            while (resultSet.next()) {
                // 検索結果を取得
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");

                // 結果表示
                System.out.println("id =  " + id);
                System.out.println("title =  " + title);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
