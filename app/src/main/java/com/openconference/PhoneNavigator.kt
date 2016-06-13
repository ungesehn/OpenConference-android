package com.openconference

import android.app.Activity
import android.content.Intent
import com.openconference.model.Session
import com.openconference.model.Speaker
import com.openconference.sessiondetails.SessionDetailsActivity

/**
 * A Navigator that is responsible to navigate between the different screens
 *
 * @author Hannes Dorfmann
 */
// TODO Tablet Navigator
class PhoneNavigator(private val activity: Activity) : Navigator {

  override fun showSessionDetails(session: Session) {
    val i = Intent(activity, SessionDetailsActivity::class.java)
    i.putExtra(SessionDetailsActivity.KEY_SESSION, session)
    activity.startActivity(i)
  }

  override fun showMySchedule() {
    throw UnsupportedOperationException()
  }

  override fun showSpeakerDetails(speaker: Speaker) {
    throw UnsupportedOperationException()
  }

  override fun showSessions() {
    throw UnsupportedOperationException()
  }

  override fun showSpeakers() {
    throw UnsupportedOperationException()
  }
}