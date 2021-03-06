package com.scdevteam.proxies.coc;

import com.scdevteam.proto.HostsMap;
import com.scdevteam.proxies.BaseClient;

public class ClashOfClansClient extends BaseClient  {
    public ClashOfClansClient(ClashOfClansProxy proxy) {
        super(proxy);
    }

    @Override
    public String getKey() {
        return "7eb15f65bdd576619abbd0b0650c45db1020f5ec969fcf48a828424f1bc8d809";
    }

    @Override
    public String getGameHost() {
        return HostsMap.PROD_CLASH_OF_CLANS;
    }

    @Override
    public String getStageGameHost() { return HostsMap.STAGE_CLASH_OF_CLANS; }
}
