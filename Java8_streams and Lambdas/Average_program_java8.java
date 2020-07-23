public Double AverageofList (List nums) {
    return nums.stream().mapToDouble(a -> a).average().getAsDouble();
}