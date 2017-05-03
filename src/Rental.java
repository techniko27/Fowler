class Rental
{
    Movie _movie;
    private int _daysRented;

    public Rental(Movie newmovie, int newdaysRented)
    {
        _movie = newmovie;
        _daysRented = newdaysRented;
    }

    public int get_daysRented()
    {
        return _daysRented;
    }

    public Movie get_movie()
    {
        return _movie;
    }

    int getFrequentRenterPoints()
    {
        // add bonus for a two day new release rental
        if ((get_movie().getPriceCode() == Movie.NEW_RELEASE) && get_daysRented() > 1)
            return 2;
        else
            return 1;
    }

    double getCharge()
    {
        return _movie.getCharge(_daysRented);
    }
}