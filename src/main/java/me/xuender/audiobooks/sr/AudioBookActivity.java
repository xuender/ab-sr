package me.xuender.audiobooks.sr;

import android.content.res.Resources;

import me.xuender.audiobooks.AbstractAudioBookActivity;
import me.xuender.audiobooks.AdRes;

public class AudioBookActivity extends AbstractAudioBookActivity {
    @Override
    protected AdRes getAdRes() {
        AdRes rs = new AdRes();
        rs.setExitMsgId(R.string.exit_msg);
        rs.setLayoutId(R.layout.activity_main);
        rs.setRawId(R.raw.sr);
        rs.setMainViewId(R.id.main_audio_view);
        rs.setScrollId(R.id.textView1);
        rs.setScrollTextId(R.array.scroll_text);

        Resources res = getResources();
        rs.setCurrentColor(res.getColor(R.color.current));
        rs.setOtherColor(res.getColor(R.color.other));
        return rs;
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(me.xuender.audiobooks.sr.R.menu.main, menu);
//        return true;
//    }
}