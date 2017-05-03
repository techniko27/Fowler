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
        return _movie._price.getFrequentRenterPoints(_daysRented);
    }

    double getCharge()
    {
        return _movie._price.getCharge(_daysRented);
    }
}