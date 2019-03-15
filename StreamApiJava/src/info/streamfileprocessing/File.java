package info.streamfileprocessing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class File {
	public static void main(String[] args) throws IOException{
		List<String> collect = Files.lines(Paths.get("D://surendra1wee.txt")).
		filter(line -> line.contains("deepak")).map(user-> user).collect(Collectors.toList());
		
		System.out.println(collect);
		

	}
}
