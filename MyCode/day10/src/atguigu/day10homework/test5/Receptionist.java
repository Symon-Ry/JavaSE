package atguigu.day10homework.test5;

/**
 * @author Symon
 * @version 1.0
 * @className Receptionist
 * @description TODO
 * @date 2020/8/4 23:34
 */
public class Receptionist {
    private Filter filter;

    public Receptionist(Filter filter) {
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }
}
