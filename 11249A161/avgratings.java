public class avgratings {
    public static void main(String[] args) {
        double[] ratings = {4.5,4.0,3.0,5.0,4.0};

        double sum = 0.0;
        double minrating = ratings[0];
        double maxrating = ratings[0];

        for (double rating : ratings)
        {
            sum += rating;
            if(rating > maxrating)
            {
                maxrating = rating;
            }
            if(rating < minrating)
            {
                minrating = rating;
            }
        }

        double averageRating = sum / ratings.length;

        System.out.println("Average Rating: " + averageRating);
    }
}
