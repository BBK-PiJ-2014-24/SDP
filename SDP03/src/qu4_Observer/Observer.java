package qu4_Observer;

public interface Observer {
    void update(String desc);

    void subscribe();

    void unSubscribe();
}