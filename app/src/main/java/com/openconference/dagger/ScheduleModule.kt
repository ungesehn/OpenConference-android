package com.openconference.dagger

import android.content.Context
import com.openconference.model.backend.schedule.ScheduleDataStateDeterminer
import com.openconference.model.backend.schedule.TimebaseScheduleDataStateDeterminer
import com.openconference.model.notification.DefaultNotificationScheduler
import com.openconference.model.notification.NotificationScheduler
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *
 * Provides some things related to the conferences schedule
 *
 * @author Hannes Dorfmann
 */
@Module
open class ScheduleModule(c: Context) {

  protected val context: Context = c.applicationContext

  @Provides
  @Singleton
  fun provideScheduleDataStateDeterminer(): ScheduleDataStateDeterminer {
    val sharedPrefs = context.getSharedPreferences("TimebaseScheduleDeterminer",
        Context.MODE_PRIVATE)
    return TimebaseScheduleDataStateDeterminer(sharedPrefs)
  }

  @Provides
  @Singleton
  fun provideNotificationScheduler(): NotificationScheduler = DefaultNotificationScheduler(context)
}