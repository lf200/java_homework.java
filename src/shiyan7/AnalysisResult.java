package shiyan7;
import java.io.*;
//import java.util.*;

class Fenxi
{
    BufferedReader reader = null;
    String[] name = new String[3];
    String[] shuxue = new String[3];
    String[] wuli = new String[3];
    String[] yingyu = new String[3];
    String[] zongfen = new String[3];

    public Fenxi()
    {
        try
        {
            FileReader fileReader = new FileReader("d://score.txt");
            reader = new BufferedReader(fileReader);
            int i = 0;
            String line;
            String[] data;
            for (; i < 3; i++)
            {
                line = reader.readLine();
                data = line.split(",");
                name[i] = data[0].split(":")[1];
                shuxue[i] = data[1].split(" ")[1];
                wuli[i] = data[2].split(" ")[1];
                yingyu[i] = data[3].split(" ")[1];
                zongfen[i] = String.valueOf(Integer.parseInt(shuxue[i]) + Integer.parseInt(wuli[i]) + Integer.parseInt(yingyu[i]));
            }
            fileReader.close();
            reader.close();

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

public class AnalysisResult
{
    public static void main(String[] args)
    {
        Fenxi fenxi = new Fenxi();
        try
        {
            FileWriter fileWriter = new FileWriter("d://scoreAnalysis.txt");
            BufferedWriter out = new BufferedWriter(fileWriter);
            for (int i = 0; i < 3; i++)
            {
                String str = "name:"+fenxi.name[i]+",shuxue "+fenxi.shuxue[i]+",wuli "+fenxi.wuli[i]+",yingyu "+fenxi.yingyu[i]+" zongFen:"+fenxi.zongfen[i]+".0";
                out.write(str);
                out.flush();
                out.newLine();
            }
            out.close();
            fileWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

