import org.quickconnectfamily.json.*;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


@WebServlet(name = "Servlet", urlPatterns = {"/ben"})
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{

            String path = "C:\\Users\\pc\\Documents\\GitHub\\Jason\\jtest.txt";
            FileInputStream fileIn = new FileInputStream(path);
            FileOutputStream fileOut =new FileOutputStream(path);
            JSONOutputStream mattout = new JSONOutputStream(fileOut);
            JSONInputStream mattIn = new JSONInputStream(fileIn);

            Trane theTrane= new Trane(1,"ben","fun");
            benout.writeObject(theTrane);
            benout.close();
            JSONOutputStream outToWeb =  new JSONOutputStream(response.getOutputStream());
            outToWeb.writeObject(theTrane);

        } catch (Exception e){
            e.printStackTrace();
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
