import java.io.*;
import java.util.*;

public class File{
    
    public static void demo(String path, ArrayList al) throws IOException {
	File f=new File(path);
	try{
            File f1[]=f.listFiles();
            for(File file:f1){
                if(file.isDirectory() == true){
                    Files(file.getAbsolutePath(),al);
                }
                else{
                    al.add(file);
                }
            }
        }
        catch(Exception e){
            if(f.exists()){
                al.add(f);
            }
            else{
                System.out.println("Path of File or Directory does not exists");
            }
        }
    }
    
    public static void main(String args[]) throws IOException{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter path : ");
	String path1 = sc.nextLine();
        System.out.println("Enter path of csv file : ");
	String path2 = sc.nextLine();
        PrintWriter p = new PrintWriter("abc.txt");
        p.append(path1);
        p.println();
        p.append(path2);
        p.flush();
        p.close();
        String loc[] = new String[2];
        int j = 0;
	ArrayList<File> arrayList=new ArrayList<>();
        PrintWriter out = null;
	try{
            File f1 = new File("paths.txt");
            BufferedReader br = new BufferedReader(new FileReader(f1));
            String ch;
            while ((ch = br.readLine()) != null) {
                loc[j] = line;
                j++;
            }
            Files(location[0],arrayList);
            File f = new File(location[1]);
            f.createNewFile();
            out = new PrintWriter(new FileOutputStream(f, true));
            out.append("Name of File,Path of File\n\r");
            for(int i=0;i<arrayList.size();i++){
                out.append(arrayList.get(i).getName() + ",");
		out.append(arrayList.get(i).getAbsolutePath());
		out.println();
		out.flush();
            }
	}
        catch(IOException e){
            System.out.println(e.getMessage());
	}
        finally {
            if(out != null){
                out.close();
            }
	}
    }
}