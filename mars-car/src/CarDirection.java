public enum CarDirection {

    E {
        @Override
        CarDirection rotate(MoveCommand command) {
            if (MoveCommand.L.equals(command)) {
                return CarDirection.N;
            } else {
                return CarDirection.S;
            }
        }
    },
    S {
        @Override
        CarDirection rotate(MoveCommand command) {
            if (MoveCommand.L.equals(command)) {
                return CarDirection.E;
            } else {
                return CarDirection.W;
            }
        }
    },
    W {
        @Override
        CarDirection rotate(MoveCommand command) {
            if (MoveCommand.L.equals(command)) {
                return CarDirection.S;
            } else {
                return CarDirection.N;
            }
        }
    },
    N {
        @Override
        CarDirection rotate(MoveCommand command) {
            if (MoveCommand.L.equals(command)) {
                return CarDirection.W;
            } else {
                return CarDirection.E;
            }
        }
    };

    abstract CarDirection rotate(MoveCommand command);
}
