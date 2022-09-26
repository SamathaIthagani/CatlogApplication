package com.dir.category.cat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Catalog {
    public static void main(String[] args) {



        List<Sale> sList = new ArrayList<>();
        Sale s1=(new Sale(1, 1, 1, 1929.0, 123L));
        Sale s2=(new Sale(2, 2, 2, 123.3, 124L));
        Sale s3=(new Sale(3, 3, 3, 3455.0, 125L));
        Sale s4=(new Sale(4, 4, 4, 2435.9, 126L));
        Sale s5=(new Sale(5, 5, 5, 1223.0, 121L));

        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);


        List<Category>  cat = new ArrayList<Category>();
        Category c1=new Category(1,"Priya", Arrays.asList(new Category(1,"Somi",null)),112L,210L);
        Category c2 =new Category(2,"Something",Arrays.asList(new Category(1,"ghbuyhb",null)),123L,332L);
        Category c3 =new Category(3,"Anything",Arrays.asList(new Category(2,"bharath",null)),1000L,50L);


        cat.add(c1);
        cat.add(c2);
        cat.add(c3);

        //  List<Category> cat=Arrays.asList(c1,c2,c3);




        Map<Object, Double> collect = sList
                .stream()
                .collect(Collectors.groupingBy(
                        e -> e.getProductId(),
                        Collectors.summingDouble(f -> f.getProductId())
                ));

        System.out.println(collect);
    }
}