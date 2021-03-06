package st.zudamue.support.android.sql.type;

import java.sql.Timestamp;

/**
 * Created by xdaniel on 1/1/17.
 *
 * @author Daniel Costa <costa.xdaniel@gmail.com>
 */

public class TimestampCharSequence extends BaseTypeCharSequence<Timestamp> {

    private Timestamp timestanp;

    public TimestampCharSequence (Timestamp timestamp) {
        super(timestamp);
    }

    public TimestampCharSequence(int year, int month, int date, int hour, int minute, int second, int nano) {
        this(new Timestamp(year, month, date, hour, minute, second, nano));
    }

    public TimestampCharSequence(long time) {
        this(new Timestamp(time));
    }
}
