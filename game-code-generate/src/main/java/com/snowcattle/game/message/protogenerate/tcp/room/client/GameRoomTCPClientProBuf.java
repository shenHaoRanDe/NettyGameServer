// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tcproom-client.proto

package com.snowcattle.game.message.protogenerate.tcp.room.client;

public final class GameRoomTCPClientProBuf {
    private GameRoomTCPClientProBuf() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface RoomHeartTCPClientProBufOrBuilder extends
            // @@protoc_insertion_point(interface_extends:RoomHeartTCPClientProBuf)
            com.google.protobuf.MessageOrBuilder {
    }

    /**
     * <pre>
     * 心跳协议
     * </pre>
     * <p>
     * Protobuf type {@code RoomHeartTCPClientProBuf}
     */
    public static final class RoomHeartTCPClientProBuf extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:RoomHeartTCPClientProBuf)
            RoomHeartTCPClientProBufOrBuilder {
        // Use RoomHeartTCPClientProBuf.newBuilder() to construct.
        private RoomHeartTCPClientProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private RoomHeartTCPClientProBuf() {
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private RoomHeartTCPClientProBuf(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            com.google.protobuf.UnknownFieldSet.Builder unknownFields =
                    com.google.protobuf.UnknownFieldSet.newBuilder();
            try {
                boolean done = false;
                while (!done) {
                    int tag = input.readTag();
                    switch (tag) {
                        case 0:
                            done = true;
                            break;
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.internal_static_RoomHeartTCPClientProBuf_descriptor;
        }

        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.internal_static_RoomHeartTCPClientProBuf_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf.class, com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf.Builder.class);
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            unknownFields.writeTo(output);
        }

        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf)) {
                return super.equals(obj);
            }
            com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf other = (com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf) obj;

            boolean result = true;
            result = result && unknownFields.equals(other.unknownFields);
            return result;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * <pre>
         * 心跳协议
         * </pre>
         * <p>
         * Protobuf type {@code RoomHeartTCPClientProBuf}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:RoomHeartTCPClientProBuf)
                com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBufOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.internal_static_RoomHeartTCPClientProBuf_descriptor;
            }

            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.internal_static_RoomHeartTCPClientProBuf_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf.class, com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf.Builder.class);
            }

            // Construct using com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3
                        .alwaysUseFieldBuilders) {
                }
            }

            public Builder clear() {
                super.clear();
                return this;
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.internal_static_RoomHeartTCPClientProBuf_descriptor;
            }

            public com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf getDefaultInstanceForType() {
                return com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf.getDefaultInstance();
            }

            public com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf build() {
                com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf buildPartial() {
                com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf result = new com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf(this);
                onBuilt();
                return result;
            }

            public Builder clone() {
                return (Builder) super.clone();
            }

            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.setField(field, value);
            }

            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return (Builder) super.clearField(field);
            }

            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return (Builder) super.clearOneof(oneof);
            }

            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return (Builder) super.setRepeatedField(field, index, value);
            }

            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return (Builder) super.addRepeatedField(field, value);
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf) {
                    return mergeFrom((com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf other) {
                if (other == com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf.getDefaultInstance())
                    return this;
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:RoomHeartTCPClientProBuf)
        }

        // @@protoc_insertion_point(class_scope:RoomHeartTCPClientProBuf)
        private static final com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf();
        }

        public static com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @java.lang.Deprecated
        public static final com.google.protobuf.Parser<RoomHeartTCPClientProBuf>
                PARSER = new com.google.protobuf.AbstractParser<RoomHeartTCPClientProBuf>() {
            public RoomHeartTCPClientProBuf parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new RoomHeartTCPClientProBuf(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<RoomHeartTCPClientProBuf> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<RoomHeartTCPClientProBuf> getParserForType() {
            return PARSER;
        }

        public com.snowcattle.game.message.protogenerate.tcp.room.client.GameRoomTCPClientProBuf.RoomHeartTCPClientProBuf getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_RoomHeartTCPClientProBuf_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_RoomHeartTCPClientProBuf_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\024tcproom-client.proto\032\014common.proto\"\032\n\030" +
                        "RoomHeartTCPClientProBufBT\n9com.snowcatt" +
                        "le.game.message.protogenerate.tcp.room.c" +
                        "lientB\027GameRoomTCPClientProBuf"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                                com.snowcattle.game.message.protogenerate.common.GameCommonMessageProBuf.getDescriptor(),
                        }, assigner);
        internal_static_RoomHeartTCPClientProBuf_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_RoomHeartTCPClientProBuf_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_RoomHeartTCPClientProBuf_descriptor,
                new java.lang.String[]{});
        com.snowcattle.game.message.protogenerate.common.GameCommonMessageProBuf.getDescriptor();
    }

    // @@protoc_insertion_point(outer_class_scope)
}
