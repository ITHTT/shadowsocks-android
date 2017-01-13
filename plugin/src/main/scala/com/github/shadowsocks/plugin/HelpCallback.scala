package com.github.shadowsocks.plugin

import android.app.Activity
import android.content.Intent

/**
  * A helper to implement HelpCallback.
  *
  * @author Mygod
  */
trait HelpCallback extends ArgsCapableActivity {
  def produceHelpMessage(args: Array[String]): CharSequence

  override protected def onInitializeArgs(args: Array[String]): Unit =
    setResult(Activity.RESULT_OK, new Intent().putExtra(PluginInterface.EXTRA_HELP_MESSAGE, produceHelpMessage(args)))
}
