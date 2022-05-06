package com.practice.TextBin.Services;


import com.practice.TextBin.Entitys.Past;
import com.practice.TextBin.Repositories.PastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.TimerTask;


@Component
public class DeletePastTask extends TimerTask {

    private Past past;
    private PastRepository pastRepository;

    public void setPastRepository(PastRepository pastRepository) {
        this.pastRepository = pastRepository;
    }

    public void setPast(Past past) {
        this.past = past;
    }

    @Override
    public void run() {
       pastRepository.delete(past);
    }
}
