package homeWork.fileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Input folder's path");
        String path1 = scanner.nextLine();
        System.out.println("Input file's name for search");
        String fileName1 = scanner.nextLine();
        System.out.println(fileSearch(path1, fileName1));

        System.out.println("Input folder's path");
        String path2 = scanner.nextLine();
        System.out.println(printSizeOfPackage(path2));

        System.out.println("input folder's path");
        String path3 = scanner.nextLine();
        System.out.println("Input file name");
        String fileName2 = scanner.nextLine();
        System.out.println("Input content");
        String content = scanner.nextLine();
        createFileWithContent(path3, fileName2, content);

        System.out.println("Please input txt path");
        String txtPath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        System.out.println(findLines(txtPath,keyword));

        System.out.println("Please input directory path");
        String dirPath = scanner.nextLine();
        System.out.println("Please input keyword");
        String keyword4 = scanner.nextLine();
        System.out.println(contentSearch(dirPath,keyword4));


    }


    static boolean fileSearch(String path, String fileName) {
        File directory = new File(path);
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.getName().equals(fileName)) {
                    return true;
                }
            }

        }
        return false;
    }

    static List<String> contentSearch(String path, String keyword) {
        File dir = new File(path);
        List<String> fileNames = new ArrayList<>();
        File[] files = dir.listFiles();
        String line = "";
        for (File file : files) {
            if (file.getName().contains(".txt")) {
                try (BufferedReader inputStream = new BufferedReader(new FileReader(file.getPath()))) {
                    while ((line = inputStream.readLine()) != null) {
                        if(line.contains(keyword)){
                            fileNames.add(file.getName());
                            break;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return fileNames;

    }

    static List<String> findLines(String txtPath, String keyword) {
        File file = new File(txtPath);
        List<String> lines = new ArrayList<>();
        try (BufferedReader inputStream = new BufferedReader(new FileReader(txtPath))) {
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                if(line.contains(keyword)){
                    lines.add(line);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    static long printSizeOfPackage(String path) {
        File folder = new File(path);
        long result = 0;
        if (folder.exists()) {
            File[] files = folder.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        printSizeOfPackage(file.getPath());
                    }
                    result += file.length();
                }
            }
        }
        return result;
    }

    static void createFileWithContent(String path, String fileName, String content) {
        String filePath = path + "\\" + fileName;
        File newFile = new File(filePath);
        try {
            if (newFile.createNewFile()) {
                System.out.println("File " + newFile.getName() + " created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fw = new FileWriter(newFile)) {
            fw.write(content);
            System.out.println("Data added to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
