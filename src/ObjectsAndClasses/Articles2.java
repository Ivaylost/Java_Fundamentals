package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
    static class Article
    {
        private String title;
        private String content;
        private String author;

        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        void Edit(String content){
            this.content = content;
        }

        void ChangeAuthor(String author){
            this.author = author;
        }

        void Rename(String title){
            this.title = title;
        }

        @Override
        public String toString() {
            return this.title + " - " + this.content + ": " + this.author;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Article> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(", ");;
            articles.add(new Article(line[0], line[1], line[2]));
        }

        String command = sc.nextLine();

        switch (command) {
            case "title":
                articles.stream().sorted(Comparator.comparing(x -> x.title)).forEach(System.out::println);
                break;
            case "content":
                articles.stream().sorted((x, y) -> x.content.compareTo(y.content)).forEach(x -> System.out.println(x));
                break;
            case "author":
                articles.stream().sorted((x, y) -> x.author.compareTo(y.author)).forEach(x -> System.out.println(x));
                break;
        }
    }
}
