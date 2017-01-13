package com.github.shadowsocks.plugin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Toast

/**
  * Activity that's capable of getting EXTRA_ARGS input.
  *
  * @author Mygod
  */
trait ArgsCapableActivity extends Activity {
  protected def args(intent: Intent = getIntent): Array[String] =
    try Commandline.translateCommandline(intent.getStringExtra(PluginInterface.EXTRA_ARG)) catch {
      case exc: IllegalArgumentException =>
        Toast.makeText(this, exc.getMessage, Toast.LENGTH_SHORT).show()
        null
    }

  /**
    * Populate args to your user interface.
    *
    * @param args Args parsed.
    */
  protected def onInitializeArgs(args: Array[String] = args()): Unit

  override protected def onPostCreate(savedInstanceState: Bundle) {
    super.onPostCreate(savedInstanceState)
    if (savedInstanceState == null) onInitializeArgs()
  }
}
