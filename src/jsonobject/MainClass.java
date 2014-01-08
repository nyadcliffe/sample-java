// JSONObjectのjarが欠損しているためコンパイルエラーが発生

//package jsonobject;
//
//import org.json.JSONException;
//import org.json.JSONObject;
//
//public class MainClass {
//
//    public static void main(String[] args) throws JSONException {
//        // JSONObjectをインスタンス生成し、コンストラクタに文字列を設定
//        JSONObject jsonObject = new JSONObject("{'lastName':'矢吹','firstName':'太朗','birthday':[1976,1,5]}");
//        System.out.println("JSONObjectをインスタンス生成し、コンストラクタに文字列を設定");
//        System.out.println(jsonObject.toString());
//        System.out.println();
//
//        // JSONObjectのput()を使用して項目毎に値を設定
//        JSONObject jsonObject2 = new JSONObject();
//        jsonObject2.put("lastName", "矢吹");
//        jsonObject2.put("firstName", "太朗");
//        int birthday[] = {1976, 1, 5};
//        jsonObject2.put("birthday", birthday);
//        System.out.println("JSONObjectのput()を使用して項目毎に値を設定");
//        System.out.println(jsonObject2.toString());
//        System.out.println();
//    }
//
//}
