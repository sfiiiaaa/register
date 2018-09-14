import com.mongodb.*;

import javax.swing.*;

public class main {
    static MongoClientURI uri;
    static MongoClient client;
    static  BasicDBObject insertUser;
    static  DBCollection con;
    static  DB db;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Register re = new Register();
        frame.setContentPane(re.getPanel());
        frame.pack(); /*it makes firm size*/
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);/*can see*/
    }
    public main(){
        try {
            uri  = new MongoClientURI("mongodb://59160936zafeeya:0866442176za@ds157522.mlab.com:57522/ox59160936");
            client = new MongoClient(uri);
            db = client.getDB("ox59160936");

        }catch (Exception g){

        }

    }


    public void input(String username, String email, String password) {
        con = db.getCollection("user");
        BasicDBObject in= new BasicDBObject();
        in.put("user",username);
        in.put("Email",email);
        in.put("Password",password);
        con.insert(in);

    }
}