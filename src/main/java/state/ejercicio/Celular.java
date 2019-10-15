package state.ejercicio;

public class Celular {

        private IStateCelular state; // requisto --- > attribute interface state

        public void setState( IStateCelular state )
        {
            this.state = state;
        }

        public IStateCelular getState()
        {
            return state;
        }

        public void request()
        {
            state.handle();
        }
}

