import java.io.*;
import java.security.*;
import java.util.*;
public class hashonebyone {
   
    //sha1
    public static byte[] SHA1Checksum(InputStream is) throws Exception {
        // 计算hash值的文件缓冲区
        byte[] buffer = new byte[1024];
        // 使用SHA1哈希/摘要算法
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead = 0;
        do {
            // 读出numRead字节到buffer中
            numRead = is.read(buffer);
            if (numRead > 0) {
                // 根据buffer[0:numRead]的内容更新hash值
                complete.update(buffer,0,numRead);
            }//文件读完 退出循环
        }while (numRead != -1);
        //关闭输入流
        is.close();
        //返回SHA1哈希值
        return complete.digest();
    }
    //sha1 print
    public  static void sha1print(String filepath){
        try {
            File file = new File(filepath);
            FileInputStream is = new FileInputStream(file);
            byte[] sha1 = SHA1Checksum(is);

            String result = "";
            for (int i = 0; i < sha1.length; i++){
                result += Integer.toString(sha1[i]&0xFF,16);
            }
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void dfs(String path){
        File dir = new File(path);
        File[] fs = dir.listFiles();
        Arrays.sort(fs);
        for(int i = 0; i < fs.length; i++){
            if(fs[i].isFile()){
                sha1print( fs[i].getPath());
            }
            if(fs[i].isDirectory()){
                System.out.println("directory: " + fs[i].getName());
                dfs(path + File.separator + fs[i].getName());
            }
        }
    }

    public static void main(String[] args){
        try  {
            dfs("E:\\JavaHomework");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}