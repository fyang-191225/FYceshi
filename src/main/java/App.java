/**
 * @author FYY
 * @date 2019/11/22 0022 下午 20:42
 */

public class App {
    private int id;

    public App() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "App{" +
                "id=" + id +
                '}';
    }
}
