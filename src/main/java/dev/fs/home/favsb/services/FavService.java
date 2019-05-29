package dev.fs.home.favsb.services;

import dev.fs.home.favsb.dao.PigMapper;
import dev.fs.home.favsb.vo.Pig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavService implements IFavService {

    private static final Logger logger = LoggerFactory.getLogger(FavService.class);

    @Autowired
    private PigMapper pigMapper;

    @Override
    public Pig getPigInfo(String pigId) {
        logger.debug("根据pigId查询pig信息");
        return pigMapper.selectByPrimaryKey(Integer.parseInt(pigId));
    }
}
