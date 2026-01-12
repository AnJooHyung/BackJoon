package BOJ_Level_13.BaekJoon10814;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
// 방법1: 기존 방식으로 Arrays.sort로 푸는 방법
// 방법2: 객체지향언어의 특성을 살려서 클래스를 따로 만들어서 푸는 방법
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Person[] persons = new Person[n];

        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            persons[i] = new Person(Integer.parseInt(str[0]), str[1]);
        }

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age - o2.age;
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(persons[i].toString());
        }
    }

    public static class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public String toString() {
            return age + " " + name;
        }
    }
}