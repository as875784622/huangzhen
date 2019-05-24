package com.hz.print;

public class PrintSql {

	public static void main(String[] args) {
		String path = "https://xfhc-minsu-simple.oss-cn-beijing.aliyuncs.com/hostel-img/2019-05-20/4ce330bb945d4972ab3bba8368a43698.jpg,https://xfhc-minsu-simple.oss-cn-beijing.aliyuncs.com/hostel-img/2019-05-20/4ce330bb945d4972ab3bba8368a43698.jpg,https://xfhc-minsu-simple.oss-cn-beijing.aliyuncs.com/hostel-img/2019-05-20/4ce330bb945d4972ab3bba8368a43698.jpg";
		String[] paths = path.split(",");
		for (int i=0;i<paths.length;i++) {
			System.out.println(paths[i].split("/"));
			System.out.println(paths[i].split("/"));
			System.out.println(paths[i].split("/"));
			System.out.println(paths[i].split("/"));
			System.out.println(paths[i].split("/"));
			System.out.println("HelloWorld!");						
		}
	}
}
