package com.github.shadowsocks.plugin;

import java.util.Locale;

/**
 * This class provides String constants that will be used in plugin interfaces.
 *
 * This class is written in Java to keep Java interoperability.
 *
 * @author Mygod
 */
public final class PluginInterface {
    private PluginInterface() { }

    /**
     * The lookup key for a string that provides the whole command as a string.
     *
     * Example: "obfs-local --obfs http --obfs-host www.baidu.com"
     */
    public static final String EXTRA_ARG = "com.github.shadowsocks.plugin.EXTRA_ARG";
    /**
     * The lookup key for a CharSequence that provides user relevant help message.
     *
     * Example: "--obfs <http|tls>          Enable obfuscating: HTTP or TLS (Experimental).
     *           --obfs-host <host_name>    Hostname for obfuscating (Experimental).
     *
     *           [--fast-open]              Enable TCP fast open.
     *                                      with                            Linux kernel > 3.7.0.
     *           [--mptcp]                  Enable Multipath TCP on MPTCP Kernel."
     */
    public static final String EXTRA_HELP_MESSAGE = "com.github.shadowsocks.plugin.EXTRA_HELP_MESSAGE";

    /**
     * Authority to use for native plugin ContentProvider.
     *
     * @param pluginId Plugin ID.
     * @return com.github.shadowsocks.plugin.$PLUGIN_ID
     */
    public static String getAuthority(String pluginId) {
        return "com.github.shadowsocks.plugin." + pluginId;
    }

    /**
     * Intent action for ConfigurationActivity.
     *
     * @param pluginId Plugin ID.
     * @return com.github.shadowsocks.plugin.$PLUGIN_ID.ACTION_CONFIGURE
     */
    public static String ACTION_CONFIGURE(String pluginId) {
        return getAuthority(pluginId) + ".ACTION_CONFIGURE";
    }
    /**
     * Intent action for HelpActivity or HelpCallback.
     *
     * @param pluginId Plugin ID.
     * @return com.github.shadowsocks.plugin.$PLUGIN_ID.ACTION_HELP
     */
    public static String ACTION_HELP(String pluginId) {
        return getAuthority(pluginId) + ".ACTION_HELP";
    }
}
