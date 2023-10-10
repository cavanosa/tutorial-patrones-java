package proxy;

import java.util.Date;

public class ProxyGameImpl implements Game {

    private Stats stats;
    private GameImpl gameImpl;

    public ProxyGameImpl(GameImpl gameImpl) {
        this.gameImpl = gameImpl;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public GameImpl getGameImpl() {
        return gameImpl;
    }

    public void setGameImpl(GameImpl gameImpl) {
        this.gameImpl = gameImpl;
    }

    @Override
    public void save(String name) {
        stats.setLastSave(new Date());
        gameImpl.setStats(stats);
        gameImpl.save(name);
    }

    @Override
    public Stats load(String name) {
        Stats stats = getGameImpl().load(name);
        setStats(stats);
        return stats;
    }
}
