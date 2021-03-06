package ch.hsr.sa.radiotour.dataaccess.models;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

public class Rider extends RealmObject {

    @PrimaryKey
    private String id;

    private int startNr;
    @Required
    private String name;
    @Required
    private String country;

    private RealmList<RiderStageConnection> riderStages;

    @LinkingObjects("riders")
    private final RealmResults<RaceGroup> raceGroups = null;


    public RaceGroup getRaceGroups() {
        try{
            return raceGroups.first();
        } catch (Exception ex){
            return null;
        }
    }

    public String getId() {
        return id;
    }

    public int getStartNr() {
        return startNr;
    }

    public void setStartNr(int startNr) { this.startNr = startNr; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public RealmList<RiderStageConnection> getRiderStages() {
        return riderStages;
    }

    public void setRiderStages(RealmList<RiderStageConnection> riderStages) {
        this.riderStages = riderStages;
    }

    public void appendStages(RealmList<RiderStageConnection> newStageConnections) {
        this.riderStages.addAll(newStageConnections);
    }

    public void removeStage(RiderStageConnection stageConnection) {
        this.riderStages.remove(stageConnection);
    }

    public void removeStages(){
        this.riderStages.clear();
    }
}
