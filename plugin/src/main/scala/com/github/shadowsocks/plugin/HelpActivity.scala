package com.github.shadowsocks.plugin

/**
  * A helper to implement HelpActivity.
  *
  * @author Mygod
  */
trait HelpActivity extends ArgsCapableActivity {
  override protected def onInitializeArgs(args: Array[String]): Unit = () // HelpActivity can choose to ignore args
}
