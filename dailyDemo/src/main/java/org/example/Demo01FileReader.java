package org.example;

import java.io.*;

@SuppressWarnings("ALL")
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\ideaProjects\\state.street.com\\DataSource\\tesTransform.txt");
        int read;
        while ((read = fileReader.read()) != -1) {
            System.out.print((char) read);
        }
        fileReader.close();

        //存储文件
        String path = "D:\\ideaProjects\\state.street.com\\DataSource\\tesTransform.txt";
        File file = new File(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));

        //构造一个bufferWriter类写入文件
        FileWriter vFileWriter= new FileWriter("D:\\ideaProjects\\state.street.com\\DataSource\\writePath.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(vFileWriter);
        String s=null;
        while ((s=br.readLine())!=null){
            bufferedWriter.write(s);
            bufferedWriter.newLine();


        }
        br.close();
        bufferedWriter.close();

    }
}
