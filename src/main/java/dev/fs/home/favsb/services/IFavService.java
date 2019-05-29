package dev.fs.home.favsb.services;

import dev.fs.home.favsb.vo.Pig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Service;

@Service
public interface IFavService {

    public Pig getPigInfo(String pigId);

}
