class ClickCounterButton extends React.Component {
    constructor(props) {
        super(props)
    }
    render() {
        return <button
            onClick={this.props.handler}
            className="btn btn-info">
            Don't touch me with your dirty hands!
        </button>
    }
}
