package ObjectsAndClasses;

import java.util.Scanner;

public class Articles
{

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
        String[] line = sc.nextLine().split(", ");
        Article article = new Article(line[0], line[1], line[2]);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(": ");
            switch (command[0]){
                case "Edit" : article.Edit(command[1]); break;
                case "ChangeAuthor" : article.ChangeAuthor(command[1]); break;
                case "Rename" : article.Rename(command[1]); break;
            }
        }
        System.out.println();
        System.out.println(article);
    }
}
