# Auto-Generated by cargo-bitbake 0.3.16
#
inherit cargo

# If this is git based prefer versioned ones if they exist
# DEFAULT_PREFERENCE = "-1"

# how to get i2c-slave-gpio could be as easy as but default to a git checkout:
# SRC_URI += "crate://crates.io/i2c-slave-gpio/0.1.0"
SRC_URI += "git://git@github.com/Fymyte/i2c-slave-gpio.rs;protocol=ssh;nobranch=1;branch=main"
SRCREV = "b6c3827674e6835148440a5ea10e3249782f3f8d"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+b6c3827674"

# please note if you have entries that do not begin with crate://
# you must change them to how that package can be fetched
SRC_URI += " \
    crate://crates.io/addr2line/0.19.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/0.7.20 \
    crate://crates.io/ansi_term/0.12.1 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.67 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bstr/1.3.0 \
    crate://crates.io/cc/1.0.79 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/clap-verbosity-flag/0.2.0 \
    crate://crates.io/clap/2.34.0 \
    crate://crates.io/crossbeam-channel/0.5.6 \
    crate://crates.io/crossbeam-deque/0.8.2 \
    crate://crates.io/crossbeam-epoch/0.9.13 \
    crate://crates.io/crossbeam-utils/0.8.14 \
    crate://crates.io/either/1.8.1 \
    crate://crates.io/env_logger/0.5.13 \
    crate://crates.io/exitfailure/0.5.1 \
    crate://crates.io/failure/0.1.8 \
    crate://crates.io/failure_derive/0.1.8 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/gimli/0.27.2 \
    crate://crates.io/globset/0.4.10 \
    crate://crates.io/globwalk/0.3.1 \
    crate://crates.io/gpio-cdev/0.5.1 \
    crate://crates.io/heck/0.3.3 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/hermit-abi/0.2.6 \
    crate://crates.io/humantime/1.3.0 \
    crate://crates.io/ignore/0.4.20 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.139 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/memchr/2.5.0 \
    crate://crates.io/memoffset/0.6.5 \
    crate://crates.io/memoffset/0.7.1 \
    crate://crates.io/miniz_oxide/0.6.2 \
    crate://crates.io/nix/0.23.2 \
    crate://crates.io/num_cpus/1.15.0 \
    crate://crates.io/object/0.30.3 \
    crate://crates.io/once_cell/1.17.1 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/0.4.30 \
    crate://crates.io/proc-macro2/1.0.51 \
    crate://crates.io/quick-error/1.2.3 \
    crate://crates.io/quicli/0.4.0 \
    crate://crates.io/quote/0.6.13 \
    crate://crates.io/quote/1.0.23 \
    crate://crates.io/rayon-core/1.10.2 \
    crate://crates.io/rayon/1.6.1 \
    crate://crates.io/regex-syntax/0.6.28 \
    crate://crates.io/regex/1.7.1 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/rustc-demangle/0.1.21 \
    crate://crates.io/same-file/1.0.6 \
    crate://crates.io/scopeguard/1.1.0 \
    crate://crates.io/serde/1.0.152 \
    crate://crates.io/serde_derive/1.0.152 \
    crate://crates.io/strsim/0.8.0 \
    crate://crates.io/structopt-derive/0.2.18 \
    crate://crates.io/structopt-derive/0.4.18 \
    crate://crates.io/structopt/0.2.18 \
    crate://crates.io/structopt/0.3.26 \
    crate://crates.io/syn/0.15.44 \
    crate://crates.io/syn/1.0.108 \
    crate://crates.io/synstructure/0.12.6 \
    crate://crates.io/termcolor/1.2.0 \
    crate://crates.io/textwrap/0.11.0 \
    crate://crates.io/thread_local/1.1.7 \
    crate://crates.io/unicode-ident/1.0.6 \
    crate://crates.io/unicode-segmentation/1.10.1 \
    crate://crates.io/unicode-width/0.1.10 \
    crate://crates.io/unicode-xid/0.1.0 \
    crate://crates.io/unicode-xid/0.2.4 \
    crate://crates.io/vec_map/0.8.2 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/walkdir/2.3.2 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
"



# FIXME: update generateme with the real MD5 of the license file
LIC_FILES_CHKSUM = " \
    file://LICENSE.txt;md5=b377b220f43d747efdec40d69fcaa69d \
"

SUMMARY = "gpio based i2c slave"
HOMEPAGE = "https://github.com/Fymyte/i2c-slave-gpio"
LICENSE = "LICENSE.txt"

# includes this file if it exists but does not fail
# this is useful for anything you may want to override from
# what cargo-bitbake generates.
include i2c-slave-gpio-${PV}.inc
include i2c-slave-gpio.inc
