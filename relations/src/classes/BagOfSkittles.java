package classes;

import java.time.LocalDate;

public class BagOfSkittles
{
    private int number;
    private String theme;
    private boolean large;
    private LocalDate produced;
    private LocalDate expired;
    private double cost;

    public BagOfSkittles(int number, String theme, boolean large,
                         LocalDate produced, LocalDate expired, double cost)
    {
        this.number = number;
        this.theme = theme;
        this.large = large;
        this.produced = produced;
        this.expired = expired;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BagOfSkittles that = (BagOfSkittles) o;

        if (number != that.number) return false;
        if (large != that.large) return false;
        if (Double.compare(that.cost, cost) != 0) return false;
        if (theme != null ? !theme.equals(that.theme) : that.theme != null) return false;
        if (produced != null ? !produced.equals(that.produced) : that.produced != null) return false;
        if (expired != null ? !expired.equals(that.expired) : that.expired != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result;
        long temp;
        result = number;
        result = 31 * result + (theme != null ? theme.hashCode() : 0);
        result = 31 * result + (large ? 1 : 0);
        result = 31 * result + (produced != null ? produced.hashCode() : 0);
        result = 31 * result + (expired != null ? expired.hashCode() : 0);
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }

    public String getTheme()
    {
        return theme;
    }

    public void setTheme(String theme)
    {
        this.theme = theme;
    }

    public boolean isLarge()
    {
        return large;
    }

    public void setLarge(boolean large)
    {
        this.large = large;
    }

    public LocalDate getProduced()
    {
        return produced;
    }

    public void setProduced(LocalDate produced)
    {
        this.produced = produced;
    }

    public LocalDate getExpired()
    {
        return expired;
    }

    public void setExpired(LocalDate expired)
    {
        this.expired = expired;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }
}
