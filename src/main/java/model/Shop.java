package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;

public record Shop<T extends Comparable<T>>(String name, Map<T, List<Integer>> assortment) {

   public void addProduct(T product) {
      /* Variante A */
      // if (!assortment.containsKey(product)) {
      // assortment.put(product, new ArrayList<>());
      // }

      /* Variante B */
      assortment.putIfAbsent(product, new ArrayList<>());
   }

   public void rateProduct(T product, int rating)
         throws NoProductFoundException, InvalidRatingException {
      if (!assortment.containsKey(product)) {
         throw new NoProductFoundException();
      }

      if (rating < 1 || rating > 5) {
         throw new InvalidRatingException(rating);
      }

      List<Integer> ratings = assortment.get(product);
      ratings.add(rating);
   }

   public Optional<T> getBestRatedProduct() {
      /* Variante A */
      // T bestRatedProduct = null;
      // double bestRating = 0;
      // for (Entry<T, List<Integer>> entry : assortment.entrySet()) {
      // T product = entry.getKey();
      // List<Integer> ratings = entry.getValue();
      // double total = 0;
      // for (Integer rating : ratings) {
      // total += rating;
      // }
      // double averageRating = total / ratings.size();
      // if (averageRating >= bestRating) {
      // bestRating = averageRating;
      // bestRatedProduct = product;
      // }
      // }
      //
      // return Optional.ofNullable(bestRatedProduct);

      /* Variante B */
      // Optional<T> bestRatedProduct = null;
      // double bestRating = 0;
      // for (Entry<T, List<Integer>> entry : assortment.entrySet()) {
      // T product = entry.getKey();
      // List<Integer> ratings = entry.getValue();
      // double total = 0;
      // for (Integer rating : ratings) {
      // total += rating;
      // }
      // double averageRating = total / ratings.size();
      // if (averageRating >= bestRating) {
      // bestRating = averageRating;
      // bestRatedProduct = Optional.of(product);
      // }
      // }
      // if (bestRatedProduct.isPresent()) {
      // return bestRatedProduct;
      // } else {
      // return Optional.empty();
      // }

      /* Variante C */
      // T bestRatedProduct = null;
      // double bestRating = 0;
      // for (Entry<T, List<Integer>> entry : assortment.entrySet()) {
      // T product = entry.getKey();
      // List<Integer> ratings = entry.getValue();
      //
      // OptionalDouble averageRating = ratings.stream().mapToInt(r -> r).average();
      //
      // if (averageRating.isPresent() && averageRating.getAsDouble() >= bestRating) {
      // bestRating = averageRating.getAsDouble();
      // bestRatedProduct = product;
      // }
      // }
      //
      // return Optional.ofNullable(bestRatedProduct);

      /* Variante D */
      return assortment.entrySet().stream().sorted((e1, e2) -> {
         OptionalDouble optional1 = e1.getValue().stream().mapToInt(r -> r).average();
         OptionalDouble optional2 = e2.getValue().stream().mapToInt(r -> r).average();
         Double averageRating1 = optional1.isPresent() ? optional1.getAsDouble() : 0;
         Double averageRating2 = optional2.isPresent() ? optional2.getAsDouble() : 0;
         return averageRating2.compareTo(averageRating1);
      }).map(Entry::getKey).findFirst();
   }

   public List<T> getAllProductsSortedByNaturalOrdering() {
      /* Variante A */
      // List<T> products = new ArrayList<>();
      // for (T p : assortment.keySet()) {
      // products.add(p);
      // }
      // Collections.sort(products);
      // return products;

      /* Variante B */
      // List<T> products = new ArrayList<>(assortment.keySet());
      // Collections.sort(products);
      // return products;

      /* Variante C */
      return assortment.keySet().stream().sorted().toList();
   }

}
