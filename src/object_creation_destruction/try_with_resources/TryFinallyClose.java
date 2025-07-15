package object_creation_destruction.try_with_resources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryFinallyClose {
    static String firstLoneOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try{
            return br.readLine();
        } finally {
            br.close();
        }
    }
}
