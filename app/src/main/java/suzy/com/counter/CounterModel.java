package suzy.com.counter;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class CounterModel extends BaseObservable {

    private int count = 0;

    @Bindable
    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
        notifyPropertyChanged(BR.count);
    }

    public void decrement() {
        count--;
        notifyPropertyChanged(BR.count);
    }
}