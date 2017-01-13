package com.github.shadowsocks.plugin

import android.app.Activity
import android.content.Intent

/**
  * A simple interface to implement ConfigureActivity.
  *
  * @author Mygod
  */
trait ConfigureActivity extends ArgsCapableActivity {
  /**
    * Equivalent to setResult(RESULT_CANCELED).
    */
  final def discardChanges(): Unit = setResult(Activity.RESULT_CANCELED)

  /**
    * Equivalent to setResult(RESULT_OK, args_with_correct_format).
    *
    * @param args Args to save.
    */
  final def saveChanges(args: Array[String]): Unit =
    setResult(Activity.RESULT_OK, new Intent().putExtra(PluginInterface.EXTRA_ARG, Commandline.toString(args)))
}
