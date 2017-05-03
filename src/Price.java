/**
 * Created by scheuermann on 03.05.2017.
 */
abstract class Price
{
    abstract int getPriceCode();
}

class ChildrensPrice extends Price
{
    int getPriceCode()
    {
        return Movie.CHILDRENS;
    }
}

class NewReleasePrice extends Price
{
    int getPriceCode()
    {
        return Movie.NEW_RELEASE;
    }
}

class RegularPrice extends Price
{
    int getPriceCode()
    {
        return Movie.REGULAR;
    }
}