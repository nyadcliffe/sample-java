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
            // �h���C�o�N���X�����[�h
            Class.forName("com.mysql.jdbc.Driver");

            // DB�ڑ�
            connection = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "root", "mysqlroot");

            // SQL������
            String queryString = "select * from tab1";

            // �X�e�[�g�����g�I�u�W�F�N�g�𐶐�
            preparedStatement = connection.prepareStatement(queryString);

            // �N�G���[���s
            ResultSet resultSet = preparedStatement.executeQuery();

            // �������ʐ����A���[�v
            while (resultSet.next()) {
                // �������ʂ��擾
                int id = resultSet.getInt("id");
                String title = resultSet.getString("title");

                // ���ʕ\��
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
