package ch.hsr.sa.radiotour.controller.adapter.presenter.interfaces;

import ch.hsr.sa.radiotour.dataaccess.models.Rider;
import ch.hsr.sa.radiotour.dataaccess.models.RiderStageConnection;
import ch.hsr.sa.radiotour.dataaccess.models.RiderStateType;

public interface IRiderStageConnectionPresenter extends IBasePresenter {
    void addRiderStageConnection(RiderStageConnection riderStageConnection);
    void getRiderStageConnections();
    void updateRiderStageConnection(final RiderStageConnection newRiderStageConnection);
    void deleteRiderStageConnection();
    void updateRiderState(final RiderStateType type, final Rider rider);
    void clearAllRiderStageConnection();
    RiderStageConnection getRiderByRank(final int rank);
}
