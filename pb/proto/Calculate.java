// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CalculateServer.proto

package com.jackniu.yarnrpc.pb.proto;

public final class Calculate {
  private Calculate() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf service {@code CalculateService}
   */
  public static abstract class CalculateService
      implements com.google.protobuf.Service {
    protected CalculateService() {}

    public interface Interface {
      /**
       * <code>rpc add(.RequestProto) returns (.ResponseProto);</code>
       */
      public abstract void add(
              com.google.protobuf.RpcController controller,
              com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request,
              com.google.protobuf.RpcCallback<com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto> done);

      /**
       * <code>rpc minus(.RequestProto) returns (.ResponseProto);</code>
       */
      public abstract void minus(
              com.google.protobuf.RpcController controller,
              com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request,
              com.google.protobuf.RpcCallback<com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto> done);

    }

    public static com.google.protobuf.Service newReflectiveService(
        final Interface impl) {
      return new CalculateService() {
        @Override
        public  void add(
            com.google.protobuf.RpcController controller,
            com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request,
            com.google.protobuf.RpcCallback<com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto> done) {
          impl.add(controller, request, done);
        }

        @Override
        public  void minus(
            com.google.protobuf.RpcController controller,
            com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request,
            com.google.protobuf.RpcCallback<com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto> done) {
          impl.minus(controller, request, done);
        }

      };
    }

    public static com.google.protobuf.BlockingService
        newReflectiveBlockingService(final BlockingInterface impl) {
      return new com.google.protobuf.BlockingService() {
        public final com.google.protobuf.Descriptors.ServiceDescriptor
            getDescriptorForType() {
          return getDescriptor();
        }

        public final com.google.protobuf.Message callBlockingMethod(
            com.google.protobuf.Descriptors.MethodDescriptor method,
            com.google.protobuf.RpcController controller,
            com.google.protobuf.Message request)
            throws com.google.protobuf.ServiceException {
          if (method.getService() != getDescriptor()) {
            throw new IllegalArgumentException(
              "Service.callBlockingMethod() given method descriptor for " +
              "wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return impl.add(controller, (com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto)request);
            case 1:
              return impl.minus(controller, (com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto)request);
            default:
              throw new AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getRequestPrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new IllegalArgumentException(
              "Service.getRequestPrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto.getDefaultInstance();
            case 1:
              return com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto.getDefaultInstance();
            default:
              throw new AssertionError("Can't get here.");
          }
        }

        public final com.google.protobuf.Message
            getResponsePrototype(
            com.google.protobuf.Descriptors.MethodDescriptor method) {
          if (method.getService() != getDescriptor()) {
            throw new IllegalArgumentException(
              "Service.getResponsePrototype() given method " +
              "descriptor for wrong service type.");
          }
          switch(method.getIndex()) {
            case 0:
              return com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.getDefaultInstance();
            case 1:
              return com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.getDefaultInstance();
            default:
              throw new AssertionError("Can't get here.");
          }
        }

      };
    }

    /**
     * <code>rpc add(.RequestProto) returns (.ResponseProto);</code>
     */
    public abstract void add(
        com.google.protobuf.RpcController controller,
        com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request,
        com.google.protobuf.RpcCallback<com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto> done);

    /**
     * <code>rpc minus(.RequestProto) returns (.ResponseProto);</code>
     */
    public abstract void minus(
        com.google.protobuf.RpcController controller,
        com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request,
        com.google.protobuf.RpcCallback<com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto> done);

    public static final
        com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptor() {
      return Calculate.getDescriptor().getServices().get(0);
    }
    public final com.google.protobuf.Descriptors.ServiceDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }

    public final void callMethod(
        com.google.protobuf.Descriptors.MethodDescriptor method,
        com.google.protobuf.RpcController controller,
        com.google.protobuf.Message request,
        com.google.protobuf.RpcCallback<
          com.google.protobuf.Message> done) {
      if (method.getService() != getDescriptor()) {
        throw new IllegalArgumentException(
          "Service.callMethod() given method descriptor for wrong " +
          "service type.");
      }
      switch(method.getIndex()) {
        case 0:
          this.add(controller, (com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto)request,
            com.google.protobuf.RpcUtil.<com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto>specializeCallback(
              done));
          return;
        case 1:
          this.minus(controller, (com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto)request,
            com.google.protobuf.RpcUtil.<com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto>specializeCallback(
              done));
          return;
        default:
          throw new AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getRequestPrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new IllegalArgumentException(
          "Service.getRequestPrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto.getDefaultInstance();
        case 1:
          return com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto.getDefaultInstance();
        default:
          throw new AssertionError("Can't get here.");
      }
    }

    public final com.google.protobuf.Message
        getResponsePrototype(
        com.google.protobuf.Descriptors.MethodDescriptor method) {
      if (method.getService() != getDescriptor()) {
        throw new IllegalArgumentException(
          "Service.getResponsePrototype() given method " +
          "descriptor for wrong service type.");
      }
      switch(method.getIndex()) {
        case 0:
          return com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.getDefaultInstance();
        case 1:
          return com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.getDefaultInstance();
        default:
          throw new AssertionError("Can't get here.");
      }
    }

    public static Stub newStub(
        com.google.protobuf.RpcChannel channel) {
      return new Stub(channel);
    }

    public static final class Stub extends CalculateService implements Interface {
      private Stub(com.google.protobuf.RpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.RpcChannel channel;

      public com.google.protobuf.RpcChannel getChannel() {
        return channel;
      }

      public  void add(
          com.google.protobuf.RpcController controller,
          com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request,
          com.google.protobuf.RpcCallback<com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.class,
            com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.getDefaultInstance()));
      }

      public  void minus(
          com.google.protobuf.RpcController controller,
          com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request,
          com.google.protobuf.RpcCallback<com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto> done) {
        channel.callMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.getDefaultInstance(),
          com.google.protobuf.RpcUtil.generalizeCallback(
            done,
            com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.class,
            com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.getDefaultInstance()));
      }
    }

    public static BlockingInterface newBlockingStub(
        com.google.protobuf.BlockingRpcChannel channel) {
      return new BlockingStub(channel);
    }

    public interface BlockingInterface {
      public com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto add(
              com.google.protobuf.RpcController controller,
              com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request)
          throws com.google.protobuf.ServiceException;

      public com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto minus(
              com.google.protobuf.RpcController controller,
              com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request)
          throws com.google.protobuf.ServiceException;
    }

    private static final class BlockingStub implements BlockingInterface {
      private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
        this.channel = channel;
      }

      private final com.google.protobuf.BlockingRpcChannel channel;

      public com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto add(
          com.google.protobuf.RpcController controller,
          com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request)
          throws com.google.protobuf.ServiceException {
        return (com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(0),
          controller,
          request,
          com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.getDefaultInstance());
      }


      public com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto minus(
          com.google.protobuf.RpcController controller,
          com.jackniu.yarnrpc.pb.proto.CalculateMessage.RequestProto request)
          throws com.google.protobuf.ServiceException {
        return (com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto) channel.callBlockingMethod(
          getDescriptor().getMethods().get(1),
          controller,
          request,
          com.jackniu.yarnrpc.pb.proto.CalculateMessage.ResponseProto.getDefaultInstance());
      }

    }

    // @@protoc_insertion_point(class_scope:CalculateService)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\025CalculateServer.proto\032\026CalculateMessag" +
      "e.proto2`\n\020CalculateService\022$\n\003add\022\r.Req" +
      "uestProto\032\016.ResponseProto\022&\n\005minus\022\r.Req" +
      "uestProto\032\016.ResponseProtoB/\n\034com.jackniu" +
      ".yarnrpc.pb.protoB\tCalculate\210\001\001\240\001\001"
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
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.jackniu.yarnrpc.pb.proto.CalculateMessage.getDescriptor(),
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}