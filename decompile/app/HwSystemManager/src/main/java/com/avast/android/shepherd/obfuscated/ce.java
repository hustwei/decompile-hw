package com.avast.android.shepherd.obfuscated;

import com.avast.android.shepherd.obfuscated.bv.m;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;

/* compiled from: Unknown */
class ce extends AbstractParser<m> {
    ce() {
    }

    public m a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return new m(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Object parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return a(codedInputStream, extensionRegistryLite);
    }
}
