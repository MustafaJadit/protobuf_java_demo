// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enumExample4.proto

public final class EnumExample4 {
  private EnumExample4() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code DayOfTheWeek}
   */
  public enum DayOfTheWeek
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>MONDAY = 1;</code>
     */
    MONDAY(1),
    /**
     * <code>TUESDAY = 2;</code>
     */
    TUESDAY(2),
    /**
     * <code>WEDNESDAY = 3;</code>
     */
    WEDNESDAY(3),
    /**
     * <code>THURSDAY = 4;</code>
     */
    THURSDAY(4),
    /**
     * <code>FRIDAY = 5;</code>
     */
    FRIDAY(5),
    /**
     * <code>SATURDAY = 6;</code>
     */
    SATURDAY(6),
    /**
     * <code>SUNDAY = 7;</code>
     */
    SUNDAY(7),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>MONDAY = 1;</code>
     */
    public static final int MONDAY_VALUE = 1;
    /**
     * <code>TUESDAY = 2;</code>
     */
    public static final int TUESDAY_VALUE = 2;
    /**
     * <code>WEDNESDAY = 3;</code>
     */
    public static final int WEDNESDAY_VALUE = 3;
    /**
     * <code>THURSDAY = 4;</code>
     */
    public static final int THURSDAY_VALUE = 4;
    /**
     * <code>FRIDAY = 5;</code>
     */
    public static final int FRIDAY_VALUE = 5;
    /**
     * <code>SATURDAY = 6;</code>
     */
    public static final int SATURDAY_VALUE = 6;
    /**
     * <code>SUNDAY = 7;</code>
     */
    public static final int SUNDAY_VALUE = 7;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DayOfTheWeek valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DayOfTheWeek forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return MONDAY;
        case 2: return TUESDAY;
        case 3: return WEDNESDAY;
        case 4: return THURSDAY;
        case 5: return FRIDAY;
        case 6: return SATURDAY;
        case 7: return SUNDAY;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DayOfTheWeek>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DayOfTheWeek> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DayOfTheWeek>() {
            public DayOfTheWeek findValueByNumber(int number) {
              return DayOfTheWeek.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return EnumExample4.getDescriptor().getEnumTypes().get(0);
    }

    private static final DayOfTheWeek[] VALUES = values();

    public static DayOfTheWeek valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DayOfTheWeek(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DayOfTheWeek)
  }

  public interface EnumMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnumMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    int getId();

    /**
     * <code>.DayOfTheWeek day_of_the_week = 2;</code>
     * @return The enum numeric value on the wire for dayOfTheWeek.
     */
    int getDayOfTheWeekValue();
    /**
     * <code>.DayOfTheWeek day_of_the_week = 2;</code>
     * @return The dayOfTheWeek.
     */
    EnumExample4.DayOfTheWeek getDayOfTheWeek();
  }
  /**
   * Protobuf type {@code EnumMessage}
   */
  public static final class EnumMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnumMessage)
      EnumMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnumMessage.newBuilder() to construct.
    private EnumMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnumMessage() {
      dayOfTheWeek_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnumMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnumMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              id_ = input.readInt32();
              break;
            }
            case 16: {
              int rawValue = input.readEnum();

              dayOfTheWeek_ = rawValue;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
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
      return EnumExample4.internal_static_EnumMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return EnumExample4.internal_static_EnumMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              EnumExample4.EnumMessage.class, EnumExample4.EnumMessage.Builder.class);
    }

    public static final int ID_FIELD_NUMBER = 1;
    private int id_;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    public static final int DAY_OF_THE_WEEK_FIELD_NUMBER = 2;
    private int dayOfTheWeek_;
    /**
     * <code>.DayOfTheWeek day_of_the_week = 2;</code>
     * @return The enum numeric value on the wire for dayOfTheWeek.
     */
    @java.lang.Override public int getDayOfTheWeekValue() {
      return dayOfTheWeek_;
    }
    /**
     * <code>.DayOfTheWeek day_of_the_week = 2;</code>
     * @return The dayOfTheWeek.
     */
    @java.lang.Override public EnumExample4.DayOfTheWeek getDayOfTheWeek() {
      @SuppressWarnings("deprecation")
      EnumExample4.DayOfTheWeek result = EnumExample4.DayOfTheWeek.valueOf(dayOfTheWeek_);
      return result == null ? EnumExample4.DayOfTheWeek.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (id_ != 0) {
        output.writeInt32(1, id_);
      }
      if (dayOfTheWeek_ != EnumExample4.DayOfTheWeek.UNKNOWN.getNumber()) {
        output.writeEnum(2, dayOfTheWeek_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (id_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, id_);
      }
      if (dayOfTheWeek_ != EnumExample4.DayOfTheWeek.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, dayOfTheWeek_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof EnumExample4.EnumMessage)) {
        return super.equals(obj);
      }
      EnumExample4.EnumMessage other = (EnumExample4.EnumMessage) obj;

      if (getId()
          != other.getId()) return false;
      if (dayOfTheWeek_ != other.dayOfTheWeek_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + getId();
      hash = (37 * hash) + DAY_OF_THE_WEEK_FIELD_NUMBER;
      hash = (53 * hash) + dayOfTheWeek_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static EnumExample4.EnumMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EnumExample4.EnumMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EnumExample4.EnumMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EnumExample4.EnumMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EnumExample4.EnumMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static EnumExample4.EnumMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static EnumExample4.EnumMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EnumExample4.EnumMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static EnumExample4.EnumMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static EnumExample4.EnumMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static EnumExample4.EnumMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static EnumExample4.EnumMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(EnumExample4.EnumMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code EnumMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnumMessage)
        EnumExample4.EnumMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return EnumExample4.internal_static_EnumMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return EnumExample4.internal_static_EnumMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                EnumExample4.EnumMessage.class, EnumExample4.EnumMessage.Builder.class);
      }

      // Construct using EnumExample4.EnumMessage.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        id_ = 0;

        dayOfTheWeek_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return EnumExample4.internal_static_EnumMessage_descriptor;
      }

      @java.lang.Override
      public EnumExample4.EnumMessage getDefaultInstanceForType() {
        return EnumExample4.EnumMessage.getDefaultInstance();
      }

      @java.lang.Override
      public EnumExample4.EnumMessage build() {
        EnumExample4.EnumMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public EnumExample4.EnumMessage buildPartial() {
        EnumExample4.EnumMessage result = new EnumExample4.EnumMessage(this);
        result.id_ = id_;
        result.dayOfTheWeek_ = dayOfTheWeek_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof EnumExample4.EnumMessage) {
          return mergeFrom((EnumExample4.EnumMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(EnumExample4.EnumMessage other) {
        if (other == EnumExample4.EnumMessage.getDefaultInstance()) return this;
        if (other.getId() != 0) {
          setId(other.getId());
        }
        if (other.dayOfTheWeek_ != 0) {
          setDayOfTheWeekValue(other.getDayOfTheWeekValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        EnumExample4.EnumMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (EnumExample4.EnumMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int id_ ;
      /**
       * <code>int32 id = 1;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>int32 id = 1;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        
        id_ = 0;
        onChanged();
        return this;
      }

      private int dayOfTheWeek_ = 0;
      /**
       * <code>.DayOfTheWeek day_of_the_week = 2;</code>
       * @return The enum numeric value on the wire for dayOfTheWeek.
       */
      @java.lang.Override public int getDayOfTheWeekValue() {
        return dayOfTheWeek_;
      }
      /**
       * <code>.DayOfTheWeek day_of_the_week = 2;</code>
       * @param value The enum numeric value on the wire for dayOfTheWeek to set.
       * @return This builder for chaining.
       */
      public Builder setDayOfTheWeekValue(int value) {
        
        dayOfTheWeek_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.DayOfTheWeek day_of_the_week = 2;</code>
       * @return The dayOfTheWeek.
       */
      @java.lang.Override
      public EnumExample4.DayOfTheWeek getDayOfTheWeek() {
        @SuppressWarnings("deprecation")
        EnumExample4.DayOfTheWeek result = EnumExample4.DayOfTheWeek.valueOf(dayOfTheWeek_);
        return result == null ? EnumExample4.DayOfTheWeek.UNRECOGNIZED : result;
      }
      /**
       * <code>.DayOfTheWeek day_of_the_week = 2;</code>
       * @param value The dayOfTheWeek to set.
       * @return This builder for chaining.
       */
      public Builder setDayOfTheWeek(EnumExample4.DayOfTheWeek value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        dayOfTheWeek_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.DayOfTheWeek day_of_the_week = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDayOfTheWeek() {
        
        dayOfTheWeek_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:EnumMessage)
    }

    // @@protoc_insertion_point(class_scope:EnumMessage)
    private static final EnumExample4.EnumMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new EnumExample4.EnumMessage();
    }

    public static EnumExample4.EnumMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnumMessage>
        PARSER = new com.google.protobuf.AbstractParser<EnumMessage>() {
      @java.lang.Override
      public EnumMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnumMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnumMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnumMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public EnumExample4.EnumMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnumMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnumMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022enumExample4.proto\"A\n\013EnumMessage\022\n\n\002i" +
      "d\030\001 \001(\005\022&\n\017day_of_the_week\030\002 \001(\0162\r.DayOf" +
      "TheWeek*w\n\014DayOfTheWeek\022\013\n\007UNKNOWN\020\000\022\n\n\006" +
      "MONDAY\020\001\022\013\n\007TUESDAY\020\002\022\r\n\tWEDNESDAY\020\003\022\014\n\010" +
      "THURSDAY\020\004\022\n\n\006FRIDAY\020\005\022\014\n\010SATURDAY\020\006\022\n\n\006" +
      "SUNDAY\020\007b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnumMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnumMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnumMessage_descriptor,
        new java.lang.String[] { "Id", "DayOfTheWeek", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
